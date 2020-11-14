package com.cherry.spike.biometric.auth.model.entidade;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor()
@RequiredArgsConstructor(staticName = "novo")
@Getter @Setter
public class ImpressaoDigital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Digital")
    private long id;
    @NonNull
    @Column(name = "Nome", nullable = false)
    private String nome;
    @NonNull
    @Column(name = "TipoArquivo", nullable = false)
    private String tipoArquivo;
    @NonNull
    @Lob
    @Column(name = "Conteudo", nullable = false)
    private byte[] conteudo;
    @NonNull
    @OneToOne(optional = false)
    @JoinColumn(name = "Usuario_ID")
    private Usuario usuario;
}
