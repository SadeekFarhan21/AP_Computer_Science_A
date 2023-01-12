class UAGStudent {
    private String name;
    private int grade;
    private String studentID;
    private static String principalName = "Ms. McKoy";
    private static int nextID = 100;
    public UAGStudent(String name, int grade){
        this.name = name;
        this.grade = grade;
        this.studentID = name.substring(0, 1).toUpperCase() + nextID;
        nextID++;
    }
    // Accessor Method
    public static void newPrincipal(String name){
        principalName = name;
    }

    public static void resetID(){
        nextID = 100;
    }

    // To String Method
    public String to_String(){
        return "Name: " + this.name + "\n" + "Grade: " + this.grade + "\n" + "Student ID: " + this.studentID + "\n" + "Principal Name: " + principalName;

    }

}