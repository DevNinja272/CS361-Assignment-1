UTEID: jk34669; jaw4978;
FIRSTNAME: Jinwook; Jesse;
LASTNAME: Kim; Wright;
CSACCOUNT: jinwook; jwright;
EMAIL: jinwook.kim@utexas.edu; jesse.wright@utexas.edu;

[Program 1]
[Description]
There are 8 java files: We used the pair-programming methodology from "Extreme Programming Installed" (see https://books.google.com/books?id=5ZuPjdO8LLoC&printsec=frontcover&dq=Extreme+Programming+Explained&hl=en&sa=X&ved=0ahUKEwjq1eyqmYfSAhWEKiYKHQpuAVEQ6wEINDAE#v=onepage&q=Extreme%20Programming%20Explained&f=false and https://www.cs.utexas.edu/users/downing/papers/Pair.Programming.2000.pdf) that we learned in CS373: Software Engineering with Glenn Downing and Fares Fraij. Jinwook Kim drove the most of the code, while Jesse Wright oversaw overall design and architecture. Afterwards, Wright took over and cleaned up and debugged teh final code. Kim then made test cases for the code. To compile our program, use the command "javac *.java" as specified in the specifications. To run the program, use "java SecureSystem instructionList" as specified in the specifications.

[Finish]
We finished all of the requirements for this program (as best we could understand the requirements in the specifications).

[Test Cases]
[Input of test 1]
write hal hobj 
read hal 
write lyle lobj 10
read hal lobj 
write lyle hobj 20
write hal lobj 200
read hal hobj
read lyle lobj
read lyle hobj
foo lyle lobj
Hi lyle, This is hal
The missile launch code is 1234567

[Output of test 1]
Reading from file: instructionList

Bad Instruction
The current state is: 
   lobj has value: 0
   hobj has value: 0
   lyle has recently read: 0
   hal has recently read: 0

Bad Instruction
The current state is: 
   lobj has value: 0
   hobj has value: 0
   lyle has recently read: 0
   hal has recently read: 0

lyle writes value 10 to lobj
The current state is: 
   lobj has value: 10
   hobj has value: 0
   lyle has recently read: 0
   hal has recently read: 0

hal reads lobj
The current state is: 
   lobj has value: 10
   hobj has value: 0
   lyle has recently read: 0
   hal has recently read: 10

lyle writes value 20 to hobj
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 10

hal writes value 200 to lobj
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 10

hal reads hobj
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 20

lyle reads lobj
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 10
   hal has recently read: 20

lyle reads hobj
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 20

Bad Instruction
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 20

Bad Instruction
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 20

Bad Instruction
The current state is: 
   lobj has value: 10
   hobj has value: 20
   lyle has recently read: 0
   hal has recently read: 20
   
[Input of Test 2]
wright high low 100
write lyle Lobj 500
lyle Hobj 100
write hal Hobj 150
read lyle lobj

[Output of Test 2]
Bad Instruction
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle writes value 500 to lobj
The current state is:
        lobj has value: 500
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

Bad Instruction
The current state is:
        lobj has value: 500
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

hal writes value 150 to hobj
The current state is:
        lobj has value: 500
        hobj has value: 150
        lyle has recently read: 0
        hal has recently read: 0

lyle reads lobj
The current state is:
        lobj has value: 500
        hobj has value: 150
        lyle has recently read: 500
        hal has recently read: 0

[Input of Test 3]
honeybutter biscuit theLegend27
 write lyle Lobj 50
  read lyle lobj
write lyle Hobj 1000000000
read hal Lobj 

[Output of Test 3]
Bad Instruction
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle writes value 50 to lobj
The current state is:
        lobj has value: 50
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle reads lobj
The current state is:
        lobj has value: 50
        hobj has value: 0
        lyle has recently read: 50
        hal has recently read: 0

lyle writes value 1000000000 to hobj
The current state is:
        lobj has value: 50
        hobj has value: 1000000000
        lyle has recently read: 50
        hal has recently read: 0

hal reads lobj
The current state is:
        lobj has value: 50
        hobj has value: 1000000000
        lyle has recently read: 50
        hal has recently read: 50

[Input of Test 4]
write lyle Lobj 100000000000000000000
read lyle Lobj
	write lyle Hobj 777
									 read lyle Lobj 	 	 	 	
read lyle Hobj

[Output of Test 4]
Bad Instruction
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle reads lobj
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle writes value 777 to hobj
The current state is:
        lobj has value: 0
        hobj has value: 777
        lyle has recently read: 0
        hal has recently read: 0

lyle reads lobj
The current state is:
        lobj has value: 0
        hobj has value: 777
        lyle has recently read: 0
        hal has recently read: 0

lyle reads hobj
The current state is:
        lobj has value: 0
        hobj has value: 777
        lyle has recently read: 0
        hal has recently read: 0

[Input of Test 5]
who ate my cookies?
?38324you did 8u12uew
write lyle lobj 100
reed lyle lobj
read lyle Hobj

[Output of Test 5]
Bad Instruction
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

Bad Instruction
The current state is:
        lobj has value: 0
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle writes value 100 to lobj
The current state is:
        lobj has value: 100
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

Bad Instruction
The current state is:
        lobj has value: 100
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0

lyle reads hobj
The current state is:
        lobj has value: 100
        hobj has value: 0
        lyle has recently read: 0
        hal has recently read: 0
