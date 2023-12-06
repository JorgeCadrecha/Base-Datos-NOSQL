package io.bootify.base_datos_n_o_s_q_l.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Usuario {

    @NotNull
    @Size(max = 255)
    private String id;

    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String username;

    @Size(max = 255)
    private String email;

    @Size(max = 255)
    private String image;

    @Size(max = 255)
    private String followers;

    @Size(max = 255)
    private String emailVerified;

}
