/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class mattieweathersbyprovider extends DataProvider {
  public String getProviderName() {
    return "mattieweathersby";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Short.class, /*short */
        "column2", Integer.class, /*integer */
        "column3", Double.class, /*float */
        "column4", String.class, /*string */
        "column5", Boolean.class, /*boolean */
        "column6", Long.class, /*long */
        "column7", Float.class); /*double */
  }
}
