#!/bin/shell

num=1

while [ $num -le 5 ]
do
	echo $num
	num=$((num + 1))
done
