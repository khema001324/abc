class A1 
{
	public static void main(String[] args) 
	{
        int i  = 5;
        switch(i){
			case 1:
               System.out.println("case1");
                break;
            case 2:
               System.out.println("case2");
                break;
            case 3:
               System.out.println("case3");
                break;
            case 4:
               System.out.println("case4");
                break;
            case 5:
               System.out.println("case5");
                break;
           ............................
           ............................
           ............................
           case 30:
               System.out.println("case30");
                break;
            default:
               System.out.println("default");
        }
		
	}
}

/*
TABLE : 1  30
0   1   L1
1   2   L2
2   3   L3
..........
..........
..........
29  30  L30
30  DEFAULT L30
*/
/*
TABLE: 1 5
1:L1
2:L2
3:L3
4:L4
5:L5



L1{
System.out.println("case1");
}
L2{
System.out.println("case2");
}
L3{
System.out.println("case3");
}
L4{
System.out.println("case4");
}
L5{
System.out.println("case5");
}

->EVERY CASE VALUES ARE SEQUENTIONAL OR NEAR TO THE SEQUENTIONAL.
TABLE SWITCH:
------------
EACH ROW BETWEEN MAPING BETWEEN LABLE AND CASE COMPILER GENERATED A CLASS FILE.
1.TABLE DISCRIPTION VALUE MIN AND MAX
2.TABLE ROWS FOR EVERY CASE MAPPING TO THE LABLE. (CASE VALUE : LABLE NAME)
3.LABLE CODE . WHATEVER CODE DEVELOPED THAT CODE KEEP IN THE BODY OF THE LABLE

-> INDEX NUMBER START WITH 0 IN ROWS
-> CURRENT VALUE - MIN VALUE = RESULT

class A1 
{
	public static void main(String[] args) 
	{
        int i  = 5;
        switch(i){
			case 5:
               System.out.println("case1");
                break;
            case 6:
               System.out.println("case2");
                break;
            case 7:
               System.out.println("case3");
                break;
           ............................
           ............................
           ............................
           case 30:
               System.out.println("case30");
                break;
            default:
               System.out.println("default");
        }
		
	}
}


TABLE : 1  30
0   5   L1
1   6   L2
2   7   L3
..........
..........
..........
29  30  L30
30  DEFAULT L30


2ND TYPE:
---------


class A1 
{
	public static void main(String[] args) 
	{
        int i  = 5;
        switch(i){
			case 5:
               System.out.println("case1");
                break;
            case 7:
               System.out.println("case2");
                break;
            case 8:
               System.out.println("case3");
                break;
           ............................
           ............................
           ............................
           case 30:
               System.out.println("case30");
                break;
            default:
               System.out.println("default");
        }
		
	}
}


TABLE : 1  30
0   5   L1
1   6   L31
2   8   L3
..........
..........
..........
29  30  L30
30  DEFAULT L31


FAKE LABLE :
------------
->    WHENEVER TABLE SWITCH GENERATED BY THE COMPILER TABLE SWITCH FOR THE MISSED CASES COMPILER GENERATED FAKE LABELS.
      ALL THE FAKE LABLE REFEREING TO DEFAULT.
*/


/*
LOOKUP CASE:
------------
-> IF CASE VALUES ARE VERY RANDAM  THAT SENORIORE WE CAN USE LOOK UP SWITCH.
-> LOOK UP SWITCH IS VERY SIMILAR TO IF ELSE LADDER.
-> IT TAKES THE FIRST VALUE CORRECT THEN MOVE TO NEXT ONE (COMPARING ONE BY ONE ).
-> PERFORMANCE IS LESS.
  

5   L1
27  L2
13  L3

.......
.......
.......
.......
30 DEFAULT L31

-> HERE TABLE NOT GENERATED.KEEP ON CHECKING ONE BY ONE VALUES THATS WHY CALLEING AS A LOOK UP SWITCH.
*/

BY USING ENUM IS ALSO POSSIABLE IN SWITCH CASE:
-----------------------------------------------

-> ENUM ARE USED FOR SIMILAR KIND OF GROUP OF FIXED NUMBER OF CONSATANTS.
-> INCASE OF ENUM ARE GENERALY USED FOR GENDERS , MONTH NAMES , SEASONS,ALL THE DAYS NAMES NUMBERS.
-> CON1 CON2 CON3 IS HAVING A UNIC ORDINAR

class U
{
enum E {CON1, CON2, CON3};
public static void main(String[] args){
	E e1 =E.CON3;
    switch(e1){
		case CON1:
       System.out.println("con1");
		case CON2:
       System.out.println("con2");
		case CON3:
       System.out.println("con3");
      
    }
  }
}



class V
{
enum Gender {MALE , FEMALE};
public static void main (String[] args){
	Gender g1 = Gender.MALE;
    Gender g2 = Gender.FEMALE;
System.out.println(g1.ordinal());
System.out.println(g2.ordinal());
}
}
output:
-------
0 and 1

-> switch case allowing a output is always  int number.
-> switch case having a unique number.
