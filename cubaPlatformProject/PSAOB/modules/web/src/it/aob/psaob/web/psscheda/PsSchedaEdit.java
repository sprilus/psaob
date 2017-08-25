package it.aob.psaob.web.psscheda;

import com.haulmont.cuba.gui.components.AbstractEditor;
import it.aob.psaob.entity.PsScheda;
import javax.inject.Inject;
import com.haulmont.cuba.gui.components.Link;
import com.haulmont.cuba.gui.components.Field;
import com.haulmont.cuba.gui.components.TextField;

public class PsSchedaEdit extends AbstractEditor<PsScheda> {

    @Inject
    private Link psSchedaStampaFoglioDimLink;

    @Override
    protected void postInit() {
        String scId = ""+ getItem().getScId();
        String scScheda = ""+ getItem().getScScheda();
        if (scId == null) {scId="SCHEDA_NON_TROVATA";}
        if (scScheda == null) {scScheda="SCHEDA_NON_TROVATA";}
        psSchedaStampaFoglioDimLink.setCaption("Stampa Foglio Dimissione Scheda "+scScheda);
        psSchedaStampaFoglioDimLink.setUrl(psSchedaStampaFoglioDimLink.getUrl()+"&IDSCHEDA="+scId);
    }
}