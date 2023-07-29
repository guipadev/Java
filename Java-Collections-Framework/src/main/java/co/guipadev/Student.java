package co.guipadev;

// Aplicando Comparable para poder ordenar de forma natural
record Student(String name, double grade) implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        return Double.compare(grade, o.grade);
    }
}
