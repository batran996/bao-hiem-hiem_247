package rikkei.academy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "feedbacks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private  User user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @NotBlank
    @Lob
    private String Content;

    @NotBlank
    @Size(min = 10,max = 11)
    @Pattern(regexp = "/[0-9]/")
    private String telephone;

}
