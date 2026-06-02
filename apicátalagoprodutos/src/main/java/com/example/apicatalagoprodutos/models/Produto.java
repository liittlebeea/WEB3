package com.example.apicatalagoprodutos.models;

@Entity
@Table(name = "tb_produtos")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
}
