import java.util.ArrayList;

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }
}

class Employee implements Person, Job {
    private String name;
    private String position;
    private String empID;
    private ArrayList<Project> myProjects;

    public Employee() {
        myProjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public String getProject() {
        StringBuilder result = new StringBuilder();
        for (Project project : myProjects) {
            result.append(project.getProjectName()).append(" : ").append(project.getDescription()).append("\n");
        }
        return result.toString();
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("EmpID: " + getEmpID());
        System.out.println("Projects");
        System.out.println(getProject());
        System.out.println("****************************************");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Tom");
        employee.setPosition("UX/UI");
        employee.setEmpID("0001");
        Project project1 = new Project("Web A", "Developing a web application");
        Project project2 = new Project("Mobile app A", "Developing a mobile app");

        employee.addProject(project1);
        employee.addProject(project2);
        employee.showDetails();
    }
}
