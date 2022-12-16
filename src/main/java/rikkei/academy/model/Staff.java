package rikkei.academy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "staffs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 6,max = 8)
    private Long staffNumber;

    @NotBlank
    private String name;

    @NotBlank
    @ManyToOne
    private RankStaff rankStaff;

    @NotBlank
    @ManyToOne
    private Agency agency;




}
