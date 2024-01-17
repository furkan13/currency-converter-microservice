package limit.service.limit.Entities;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Limits {
 private int minimum;
 private int maximum;
}
