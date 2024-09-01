#!/bin/bash

echo "Enter your number"
read num1

result=$((num1%2))

if [ $result -eq 0 ]
then
	echo "it's an even number"
else
	echo "it's an odd number"
fi
