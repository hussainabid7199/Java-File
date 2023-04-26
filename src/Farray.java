public class Farray {
    public static void main(Stringlearn[] args) {
            int marks[] = new int[3];
            marks[0] = 89;
            marks[1] = 78;
            marks[2] = 65;
            try {
                for(int i = 0; i< marks.length; i++){
                    System.out.println(marks[i]);
                }
            } catch (Exception e) {
                throw e;
            }
    }
}
