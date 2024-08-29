```bash
$ mkdir LinuxAssignment
$ ls -l
```

```bash
//to show the result in terminal itself
//main use is concatenation
cat lower.txt
```

```bash
//change the permission of file
//first it was like
-rw-r--r-- 1 cdac  cdac   0 Aug 28 19:02 file3.txt
//after the command 
chmod g+x file3.txt
-rw-r-xr-- 1 cdac  cdac   0 Aug 28 19:02 file3.txt
x - executes
r - read
w - write
O - others 
U- owner
G - group
A - all user
```

```bash
$ touch file1.txt
// this command also use to create file but time stamp.
```

```bash
//for rename
mv <oldname.txt> <newname.txt>
```

```bash
cdac@Udayraj:~$ ls
LinuxAssignment  udayraj
cdac@Udayraj:~$ cd LinuxAssignment/
cdac@Udayraj:~/LinuxAssignment$ ls
docs
cdac@Udayraj:~/LinuxAssignment$ touch file2.txt
cdac@Udayraj:~/LinuxAssignment$ cp file2.txt docs/
cdac@Udayraj:~/LinuxAssignment$ cd docs/
cdac@Udayraj:~/LinuxAssignment/docs$ ls
file1.txt  file2.txt
cdac@Udayraj:~/LinuxAssignment/docs$
```

```bash
to find in repository
find -name file2.txt
-> ./docs/file2.txt
```

```bash
//to find all .txt related files in certain folder folder path is  /home/cdac/LinuxAssignment  

->  find /home/cdac/LinuxAssignment -name *.txt
```

```bash
//to print only first 2 line in the terminal

-> head -2 file1.txt
```

```bash
//to print ip address
 ifconfig
//and after to show ping use

ping <use ip address>
```

```bash
//to find/search a certain word in file
grep -w "try hard" file1.txt
try hard
```

```bash
//to find date and time

-> date
```

```bash
 //to compress to zip
 zip -r docs.zip docs
 zip -r <newfileName> <target file>
```

```bash
operator < and | 
```

```bash
// to uppercase to lowercase file information 
tr '[:upper:]' '[:lower:]' < upper.txt > lower.txt
upper and lower are a class
```

```bash
//to change the owner of file
sudo chown user2 file2.txt
```

```bash
//sort and give highest occurence word in top 
output:cdac@Udayraj:~/LinuxAssignment$ sort fruits.txt | uniq -c
      1 banana
      2 blueberry
      1 grapes
      1 mango
      1 pineapple
      
sort fruits.txt | uniq -c
-------------------------------
sort fruits.txt | uniq
banana
blueberry
grapes
mango
pineapple
```