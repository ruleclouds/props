package org.ruleclouds.util;

import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

/**
 * Props - expand all environment properties from standard input to standard output
 */
public class Props {
    public static void main(String[] args) throws IOException {
        System.out.print(
                StringSubstitutor.replaceSystemProperties(
                        IOUtils.toString(System.in, (String) null)));

    }
}
