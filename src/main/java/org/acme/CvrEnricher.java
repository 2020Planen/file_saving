/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme;

import java.io.IOException;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

/**
 *
 * @author Rasmu
 */
@ApplicationScoped
public class CvrEnricher {

    @Incoming("file-enrichment")
    public void enrichCvr(String msg) throws IOException, Exception {

    }
}
