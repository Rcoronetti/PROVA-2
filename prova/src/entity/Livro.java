import org.hibernate.annotations.Entity;

@Getter
@Entity
@NoArgsConstrutor
@ToString
@AllArgsConstrutor

public class Livro{
    @Id
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;
    @Enumerated(EnumType.String)
    private Categoria categoria;
    @Enumerated(EnumType.String)
    private Modelo modelo;
    
    
}