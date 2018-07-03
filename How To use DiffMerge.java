/*
how to use diff merge tool----------------------------------------------

when you open up the program there are [2 folder slots] we can choose from 
so we are [comparing 2 files] that have the same data code but one has bugs 

choose the [folder] and the [src] main class

it will show the [original] file vs the [bug]file 

the original will always go on the left side the reason is read below you will know 

inside the program in the [middle] of the two files you will see a [blue block]

[blue block] shows the [difference] between the [two file code] and the [change highlighted in red]

ex on [line 82] there will be a [blue block] and a [red highlight in the code] 

[red highlight] shows the [change] you have made in [bug code] 

[also] on the [left hand side] there is a [scroll bar] that [shows] [all kinds] of [red colors] [highlighting the differences] 

[also] when you [make changes] in [one of your code] [diffmerge] will [know] that [change] and [notify you]
if you [reload] the [program] the [updated code] is now [displayed on the screen]

[also] on the [top] of the [program] there are [tool bars] on the [far right] there are [3 file icons]

the [first file icon] with the [file arrow going right] [transfers] the the [highlighted chunk of code] on [to the bug file] 
[just in case] [you deleted it], [automatically] will [put your original code] on to the [bug file] 

the [2nd & 3rd] are just a [easier way] to [navigate] your [difference code] 
it will [jump] from [one red highlighted] to [another red highlighted code] 

so [in the code] if [diffmerge sees] an [extra bit of code], [that bit of code] is the [darkest red] in the [program] 

the [lighter red] [behind] the [code] is just [saying] that the [program is hinting/guiding] us [more] for the [changes made in those 2 files ]

After the changes have been made you can save the files with the file icon and the changes will automatically update in IntelliJ 

Now when you look at the diffmerge home page and we reload(ctrl + R) the home page 
the files are only one file that indicates that both files now are efficiently identical 

next go to the main home page of diffmerge and go to tool>options>folder filters ...why?

because Java class file is a compressed Java source file so thats something we don't want to check so what we can do here 
go down under filename filters, making sure the check box is on 
in the box put space and put *.class

by putting the *.class that tells diffmerge that not to try and ever check differences between files of top class start up these all files 

if you want to exclude other files that are not necessary for file comparison then head down to sub - folder - filters 
and same style we start with a . and the desired file you want to exclude ex .idea 
*/