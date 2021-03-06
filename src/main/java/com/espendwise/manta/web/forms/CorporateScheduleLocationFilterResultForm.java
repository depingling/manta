package com.espendwise.manta.web.forms;

import com.espendwise.manta.model.view.SiteListView;
import com.espendwise.manta.util.SelectableObjects;
import java.util.List;

public class CorporateScheduleLocationFilterResultForm  extends AbstractFilterResult<SelectableObjects.SelectableObject<SiteListView>> {

    private SelectableObjects<SiteListView> sites;

    public SelectableObjects<SiteListView> getSites() {
        return sites;
    }

    public void setSites(SelectableObjects<SiteListView> sites) {
        this.sites = sites;
    }

    @Override
    public List<SelectableObjects.SelectableObject<SiteListView>> getResult() {
        return sites != null ? sites.getSelectableObjects() : null;
    }

    @Override
    public void reset() {
        super.reset();
        this.sites = null;
    }

}
