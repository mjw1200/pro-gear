#!/bin/bash

d1=$1
d2=$2

echo "Checking $d1"
pushd "$d1" 
md5 * > ../d1_md5s.out
popd
echo ""

echo "Checking $d2"
pushd "$d2"
md5 * > ../d2_md5s.out
popd
echo ""

echo -n "Verdict: "
diff -q d1_md5s.out d2_md5s.out > /dev/null 2>&1
if test $? -eq 0; then
  echo "You're golden"
else
  echo "Trouble, bub"
fi
