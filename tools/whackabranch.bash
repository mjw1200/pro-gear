#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 [branch_name]"
  exit 1
fi

victimBranch=$1
victimExists=0

pushd insite-commerce > /dev/null 2>&1

git checkout dev > /dev/null 2>&1
for branch in `git branch -a | grep $1 | sed 's/remotes\/origin\///' | sort | uniq`
do
  if [ $victimBranch = $branch ]; then
    victimExists=1
  fi
done

if [ $victimExists = 1 ]; then
  read -p "A branch named \"$victimBranch\" exists. Nuke it? [yY/nN] "
  if [ $REPLY = "y" -o $REPLY = "Y" ]; then
    git push -d origin $victimBranch
    git branch -D $victimBranch
  else
    echo "Boldly doing nothing"
  fi
else
  echo "\"$victimBranch\" doesn't seem to be a branch"
fi

popd > /dev/null 2>&1

exit 0