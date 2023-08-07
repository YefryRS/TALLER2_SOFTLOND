import java.util.List;

public class Empresa {
    private int id;
    private String empresa;
    List<Empleado> empleados;

    public Empresa() {
    }

    public Empresa(int id, String empresa, List<Empleado> empleados) {
        this.id = id;
        this.empresa = empresa;
        this.empleados = empleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
