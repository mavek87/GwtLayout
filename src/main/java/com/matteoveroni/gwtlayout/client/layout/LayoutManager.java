package com.matteoveroni.gwtlayout.client.layout;

import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.matteoveroni.gwtlayout.client.LayoutConstants;
import com.matteoveroni.gwtlayout.client.layout.types.LayoutHeaderFooter;
import com.matteoveroni.gwtlayout.client.layout.types.LayoutPlainHtml;
import com.matteoveroni.gwtlayout.client.layout.types.LayoutSimple;

//import javax.annotation.PostConstruct;
//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

//@ApplicationScoped
public class LayoutManager {

	private final Map<Class<? extends Layout>, Layout> layouts = new HashMap<>();

	private Layout layoutInUse;

//	@Inject
	private LayoutHeaderFooter layoutHeaderFooter;
//	@Inject
	private LayoutSimple layoutSimple;
//	@Inject
	private LayoutPlainHtml layoutPlainHtml;

	public LayoutManager(LayoutHeaderFooter layoutHeaderFooter, LayoutSimple layoutSimple, LayoutPlainHtml layoutPlainHtml) {
		this.layoutHeaderFooter = layoutHeaderFooter;
		this.layoutSimple = layoutSimple;
		this.layoutPlainHtml = layoutPlainHtml;
	}

	@PostConstruct
	public void init() {
		layouts.put(LayoutHeaderFooter.class, layoutHeaderFooter);
		layouts.put(LayoutSimple.class, layoutSimple);
		layouts.put(LayoutPlainHtml.class, layoutPlainHtml);
	}

	public void useLayout(Layout layout) {
		layoutInUse = layout;

		final RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();

		clearView();

		if (layout instanceof LayoutHeaderFooter) {
			RootPanel.get().add(rootLayoutPanel);
		} else if (layout instanceof LayoutHeaderFooter) {
			RootPanel.get().add(rootLayoutPanel);
		} else if (layout instanceof LayoutHeaderFooter) {
		}

		layouts.get(layoutInUse.getClass()).apply();
	}

	public Class<? extends Layout> getLayoutInUse() {
		return layoutInUse.getClass();
	}

	private void clearView() {
		final RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		rootLayoutPanel.clear();
		RootPanel.get().remove(rootLayoutPanel);

		RootPanel.get(LayoutConstants.PLAIN_HTML_CONTAINER).clear();
		RootPanel.get().clear();
		RootPanel.get(LayoutConstants.PLAIN_HTML_CONTAINER).getElement().setInnerHTML("");
	}
}
