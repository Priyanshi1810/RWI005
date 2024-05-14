
public class Office {
    public static void main(String[] args) {
        Employes employee = new Employes() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getSalary() {
                return "40000";
            }
            @Override
            public  String getDesignation(){
                return  "software engineer";
            }
        };
        System.out.println(employee.getSalary());
    }
}

