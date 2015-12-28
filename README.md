#TranskOP | [Wiki](https://github.com/dzinot/transkOP/wiki)

A basic programming language for Humans of Transkop

##Introduction
Traskop is love. Transkop is life.

##Hello World

	MAJSTORE TRGAJ
	I SHO VIKASH? "Hello World"
	MAJSTORE STOJ STIGNAVME

##Quick Start

	download the jar: https://goo.gl/0EfNtT
	write code, save as .transkop (see sample code)
	java -jar transkop.jar file_name.transkop
	java file_name

##Brief overview of the keywords

Check the [wiki](https://github.com/dzinot/transkOP/wiki) for more details.

Keywords 						| TranskOP Keywords
--------------------------------|------------------------------------------------------
BeginMain                       | `MAJSTORE TRGAJ`
EndMain                         | `MAJSTORE STOJ STIGNAVME`
SetInitialValue                 | `I TAKA MU VELAM...`
DeclareInt                      | `OVDE AKO MOZHI`
Return                          | `15 MINUTI PAUZA`
Print                           | `I SHO VIKASH?`
ReadInteger                     | `KOLKU PARI?`
AssignVariable                  | `PUCAJ`
SetValue                        | `AJDE AJDE`
EndAssignVariable               | `4AO MA4E`
False	                        | `DAJ BE NE LAZHI`
True                            | `ZHIMI GOSPOT NE LAZHAM`
If                              | `SAMO AKO NE E TAKA`
EndIf                           | `E AKO NE OVA KOJ KUR`
Else                            | `I POSLE SHO SE DESI?`
While                           | `CHEKAJ BRAT MALKU`
EndWhile                        | `DOSTA E BRAT` 
PlusOperator                    | `EDNA POGORE`
MinusOperator                   | `EDNA PODOLU`
MultiplicationOperator          | `SHALTOVAJ NAGORE`
DivisionOperator                | `SHALTOVAJ NADOLU`
ModuloOperator                  | `GO EBA MENJACHO`
EqualTo                         | `ORIGINAL OD KINA BRAT`
GreaterThan                     | `NA KOJ MU E POGOLEM?`
Or                              | `ALI`
And                             | `I BAMUJA?`
DeclareMethod                   | `POLEKA SITE JAS KAKO SHO KE KAZHAM`
NonVoidMethod                   | `SHO SAKAM PRAM`
MethodArguments                 | `AJDE TORBITE`
EndMethodDeclaration            | `AJT DOSTA E`
CallMethod                      | `VRTAM 2 BROJA`
AssignVariableFromMethodCall    | `AJDE BRE`
ParseError                      | `ZNAM SHO MU E, RASIPAN E`

##Sample code
	MAJSTORE TRGAJ
	
	I SHO VIKASH? "Hello World!"
	
	OVDE AKO MOZHI a
	I TAKA MU VELAM... 7
	
	I SHO VIKASH? a
	
	OVDE AKO MOZHI sho
	I TAKA MU VELAM... 1
	
	PUCAJ sho
	AJDE AJDE sho
	EDNA POGORE 1
	4AO MA4E
	
	I SHO VIKASH? sho
	
	PUCAJ sho
	AJDE AJDE sho
	EDNA PODOLU 1
	SHALTOVAJ NAGORE 3
	GO EBA MENJACHO 2
	4AO MA4E
	
	I SHO VIKASH? sho
	
	MAJSTORE STOJ STIGNAVME

##Motivation and Inspiration
Mostly boredom. Derived from [Fuckboi](https://github.com/VirenMohindra/Fuckboi) - the Fuckboi programming language.

##Features
1. file extension of .transkop
	example = HelloWorld.transkop
2. Passed ArithmeticTests, BranchStatementTests, FeatureTests, TranskopGeneratorTests, InputTests, LogicalTests, and MethodTests.

##Limitations
1. Variables can only be 16bit signed integers.
2. FULL THROTTLE

##To Do List
1. Switch Case Statement
2. [Euler's Tests](https://projecteuler.net/)
3. Comments. //pretty important because anything written in Transkop will be practically unreadable to a normal human being.
4. Nicer syntax errors (?)
5. Read Input
6. Continue/ Next
7. Delete objects
8. Break/ NULL/ Static
9. Random numbers
10. FOR LOOP
