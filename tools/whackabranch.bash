#!/bin/bash

if [ $# -ne 3 ]; then
  echo "Usage: $0 [repo dir] [default branch name] [victim branch name]"
  exit 1
fi

victimBranch=$3
victimExists=0

pushd $1 > /dev/null 2>&1

git checkout $2 > /dev/null 2>&1
for branch in `git branch -a | grep $3 | sed 's/remotes\/origin\///' | sort | uniq`
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