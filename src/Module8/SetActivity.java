package Module8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetActivity {


            public static void main(String[] args) {
                //TODO: 1 - Type code to create a set of names.
                Set mySet = new HashSet();
                mySet.add("John");
                mySet.add("Sarathi");
                mySet.add("Regina");
                mySet.add("Daniel");
                //Also try adding a few duplicate entries to this set.

                //TODO: 2 - Call print method to print the set passed as its parameter.
                print(mySet);
                TreeSet myTreeset = new TreeSet(mySet);
                print(myTreeset);

            }

            static void print(Set set) {

                //TODO: 3 - Type code to print this set
                //Notice the order in which elements get printed.
                System.out.println("set");
                for (Object nameOfMyObject : set) {
                    System.out.println(nameOfMyObject.toString());
                }
            }
        }



