package org.example;

public class Person {
    /*
    1.ID
    2.Name
    3.Email
    */
    private int id;
    private String name;
    private String email;

    ///  Los fraameworks ORM(Hibernate/JPA) utilizan reflexión para crear instancias de las clases cuando recuperan datos de la base de datos
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /// Constructor con todos los parametros
    /// Este constructir se usa cuando creamos un objeto persona con todos sus datos conocidos
    public Person(String name, String email) {
        this.name = name;
        this.email = email;


    ///Metodos
    /// Permisos
        public String mostrarInfo () {
                return "ID:" +id + "\n"
            "NOMBRE" + name + "\n"
                + "EMAIL" + email;
            }

            /// Getters y setters
            public int getId () {


                public String getName () {
                    return name;
                }

                public void setName (String name){
                    this.name = name;
                }

                public int getId () {
                    return id;
                }

                public void setId ( int id){
                    this.id = id;
                }

                public String getEmail () {
                    return email;
                }

                public void setEmail (String email){
                    this.email = email;
                }

            }

        }

    }
}