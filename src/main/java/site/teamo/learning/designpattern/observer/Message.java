package site.teamo.learning.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by haoco on 2018/4/7.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    int id;
    String name;
    String email;
    String content;
}
