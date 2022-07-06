public class se {
    public static void main(String[] args) throws Exception {
        Person pt = new Person();
        pt.setAgeWeight(29, 88);
        pt.setCl(4);
        pt.setFio("dю,eff");

        System.out.println("Работник " + pt.getFio() + ", возраста " + pt.getAge());
    }
}

class Person{
    private String fio;
    private int age, weight, cl;

//    {
//        x = 1; y = 2;
//        color = 100;
//    }

    Person(){}

    public boolean isCorrect(int x){
        return (x > 29 && x < 201);
    }

    public void setAgeWeight(int age, int weight) {
        if (isCorrect(age) && isCorrect(weight)){
            this.age = age; this.weight = weight;
        }
    }

    public void setCl(int cl) {
        if (cl > 0 && cl < 6){
            this.cl = cl;
        }
    }

    public void setFio(String fio) {
        if (fio.matches("[a-zA-Zа-яА-Яё -]*")){
            this.fio = fio;
        }
    }
    public int getAge() { return age; }
    public int getWeight() { return weight; }
    public int getCl() { return cl; }
    public String getFio() { return fio; }


}
