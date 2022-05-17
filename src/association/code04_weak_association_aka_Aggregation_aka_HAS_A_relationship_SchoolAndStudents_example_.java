package association;// This relationship between two objects is known as the association in OOPS software design
// and depicted by an arrow in UML.

// Aggregation is when one class is associated with other class 
// but both can exist independently

// Since School Has Students and Teachers, the relationship between them is Association.

import java.util.List;
public class code04_weak_association_aka_Aggregation_aka_HAS_A_relationship_SchoolAndStudents_example_ {

    public class School {
        private List<Student> students;
        private List<Teacher> teachers;
    }

    class Student {
        private String attributes;
    }

    class Teacher {
        private String attributes;
    }
}