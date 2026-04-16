package com.NeoMusic.Core.Permanence.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_credentials")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long credentialId;
    private String credentialEmail;
    private String credentialPassword;
    private Boolean credentialActive;
    private String credentialPhone;


}
