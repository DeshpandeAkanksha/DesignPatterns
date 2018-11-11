Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=firstarg -Darg1=SECOND -Darg2=THIRD

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.â€

[Date: ] -- 04/22/2018

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)


-----------------------------------------------------------------------

Approach:
-Start
-Load all the text files
	-Populate product1 arraylist from product1.txt+common.txt
	-Populate product2 arraylist from product2.txt+common.txt
	-Populate product3 arraylist from product3.txt+common.txt
	-Populate product4 arraylist from product4.txt+common.txt
-Create hashmap of synonyms from synonyms.txt
-Read input file
	For each entry in UserInput.txt
	-check the product
	-create object of the product
	-run all 3 searches
	-return list of results
	
