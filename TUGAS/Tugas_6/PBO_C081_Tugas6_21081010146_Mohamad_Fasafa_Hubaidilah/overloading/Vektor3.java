public class Vektor3 {
    private int[] value = new int[3];

    public Vektor3(int x, int y, int z){
        this.value[0] = x;
        this.value[1] = y;
        this.value[2] = z;
    }

    public int getvalue(int index){
        return this.value[index];
    }

    public void setvalue(int index, int value){
        this.value[index] = value;
    }

    public void print(){
        System.out.print("("+this.value[0]+","+this.value[1]+","+this.value[2]+")");
    }

    public int multiply(Vektor3 vector){
        int result = 0;
        for(int i = 0; i < 3; i++){
            System.out.print(result+" + ("+this.getvalue(i)+" * "+vector.getvalue(i)+") = ");
            result += this.getvalue(i) * vector.getvalue(i);
            System.out.println(result);
        }
        return result;
    }

    public Vektor3 multiply(int scalar){
        Vektor3 result = new Vektor3(0,0,0);
        for(int i = 0; i < 3; i++){
            result.setvalue(i, this.getvalue(i) * scalar);
        }
        return result;
    }
}