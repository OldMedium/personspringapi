package dio.springboot.personspringapi.dto.request;


import dio.springboot.personspringapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated
    private PhoneType type;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String number;
}
