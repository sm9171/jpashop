package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
