package it.aob.psaob.web.prrichieste;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Link;
import it.aob.psaob.entity.PrRichieste;

import javax.inject.Inject;

public class PrRichiesteEdit extends AbstractEditor<PrRichieste> {

    @Inject
    private Link prRichiesteStampa;

    @Override
    protected void postInit() {
        String ricCode = ""+ getItem().getRicCode();
        if (ricCode == null) {ricCode="RICHIESTA_NON_TROVATA";}
        prRichiesteStampa.setCaption("Stampa Richiesta "+ricCode);
        prRichiesteStampa.setUrl(prRichiesteStampa.getUrl()+"&RIC_CODE="+ricCode);
    }
}