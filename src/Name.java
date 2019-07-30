public class Name {
    private char[] name;

    public Name(char[] string){
        this.name = string;
    }

    public char[] getName() {
        return name;
    }

    public String toString(){
        String stringName = "";
        for(int index = 0; index <= name.length-1; index++){
            stringName = stringName+name[index];
        }
        return stringName;
    }

    public void printBackwards(){
        //Alternative build a string, store it and print that
        for (int count = name.length -1;  count >= 0; count--){
            System.out.print(name[count]);
        }
    }

    /*
     0   1   2   3   4   5
    [a] [n] [j] [u] [l] [i]
     */

}
