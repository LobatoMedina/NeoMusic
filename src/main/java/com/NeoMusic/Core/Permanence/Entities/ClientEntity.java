package com.NeoMusic.Core.Permanence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_user")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String userLastName;
    private String userNickname;
    private Integer role_id;
}
