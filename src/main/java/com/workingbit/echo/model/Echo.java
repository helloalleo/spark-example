package com.workingbit.echo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Aleksey Popryaduhin on 23:09 06/10/2017.
 */
@AllArgsConstructor
@Data
public class Echo implements Payload {

  private String echo;
}
