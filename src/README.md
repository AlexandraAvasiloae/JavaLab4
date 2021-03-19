# Lab 4


## Compulsory(1p)

```
(done)Create an object-oriented model of the problem. You should have at least the following classes: Student, School and the main class.
(done)Create all the objects in the example using streams.
(done)Create a list of students, using LinkedList implementation. Sort the students, using a comparator.
(done)Create a set of schools, using a TreeSet implementation. Make sure that School objects are comparable.
(done)Create two maps (having different implementations) describing the students and the compulsory.school preferences and print them on the screen.

OUTPUT:

"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=64737:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\JavaLab4\target\classes" compulsory.school.Main
Student preferences are: 
{Student{name='S0'}=[School{name='H0', capacity=1}, School{name='H1', capacity=2}, School{name='H2', capacity=2}], Student{name='S1'}=[School{name='H0', capacity=1}, School{name='H1', capacity=2}, School{name='H2', capacity=2}], Student{name='S2'}=[School{name='H0', capacity=1}, School{name='H1', capacity=2}], Student{name='S3'}=[School{name='H0', capacity=1}, School{name='H2', capacity=2}]}
School preferences are: 
{School{name='H0', capacity=1}=[Student{name='S3'}, Student{name='S0'}, Student{name='S1'}, Student{name='S2'}], School{name='H1', capacity=2}=[Student{name='S0'}, Student{name='S2'}, Student{name='S1'}], School{name='H2', capacity=2}=[Student{name='S0'}, Student{name='S1'}, Student{name='S3'}]}

Process finished with exit code 0
Process finished with exit code 0

```
##Optional (2p)

```
(done)Create a class that describes the problem and one that describes a solution (a matching) to this problem.
(done)Using Java Stream API, write queries that display the students who find acceptable a given list of schools, and the schools that have a given compulsory.student as their top preference.
(done)Use a third-party library in order to generate random fake names for students and schools.
(done)Implement an algorithm for creating a matching, considering that each compulsory.student has a score obtained at the evaluation exam and the schools rank students based on this score.
(done)Test your algorithm.


OUTPUT:

"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=55424:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\lab4\target\classes;C:\Users\Alexandra\.m2\repository\com\github\javafaker\javafaker\1.0.2\javafaker-1.0.2.jar;C:\Users\Alexandra\.m2\repository\org\apache\commons\commons-lang3\3.5\commons-lang3-3.5.jar;C:\Users\Alexandra\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23-android.jar;C:\Users\Alexandra\.m2\repository\com\github\mifmif\generex\1.0.2\generex-1.0.2.jar;C:\Users\Alexandra\.m2\repository\dk\brics\automaton\automaton\1.11-8\automaton-1.11-8.jar" optional.compulsory.school.Main
The candidates are: 
Adam Kohler DDS
Sandy Upton
William Deckow
Myesha Kling


The schools are: 
Metz-Stroman with 1 available places
Mohr, Stroman and Reinger with 2 available places
Steuber Inc with 2 available places


The students preferences are: 
Adam Kohler DDS prefers: 
Metz-Stroman
Mohr, Stroman and Reinger
Steuber Inc


Myesha Kling prefers: 
Metz-Stroman
Steuber Inc


Sandy Upton prefers: 
Metz-Stroman
Mohr, Stroman and Reinger
Steuber Inc


William Deckow prefers: 
Metz-Stroman
Mohr, Stroman and Reinger


The schools preferences are: 
Metz-Stroman prefers: 
Myesha Kling
Adam Kohler DDS
Sandy Upton
William Deckow


Steuber Inc prefers: 
Adam Kohler DDS
Sandy Upton
Myesha Kling


Mohr, Stroman and Reinger prefers: 
Adam Kohler DDS
William Deckow
Sandy Upton


The list of acceptable compulsory.school for Adam Kohler DDS is [School(name=Metz-Stroman, capacity=1), School(name=Mohr, Stroman and Reinger, capacity=2), School(name=Steuber Inc, capacity=2)]


Metz-Stroman's favorite stundet is Student(name=Myesha Kling)


Adam Kohler DDS will study at Mohr, Stroman and Reinger
Sandy Upton will study at Steuber Inc
William Deckow will study at Mohr, Stroman and Reinger
Myesha Kling will study at Metz-Stroman

Process finished with exit code 0

```
