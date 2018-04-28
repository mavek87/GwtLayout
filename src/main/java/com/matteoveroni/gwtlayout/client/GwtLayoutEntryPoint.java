package com.matteoveroni.gwtlayout.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.matteoveroni.gwtlayout.client.layout.widgets.footer.GwtLayoutFooter;
import com.matteoveroni.gwtlayout.client.layout.widgets.header.GwtLayoutHeader;
import static elemental2.dom.DomGlobal.document;
import elemental2.dom.HTMLElement;

public class GwtLayoutEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		generaLoremIpsum();

		final GwtLayoutHeader header = new GwtLayoutHeader();
		final GwtLayoutFooter footer = new GwtLayoutFooter();
		final RootPanel rootPanel = RootPanel.get();

		rootPanel.add(header);
		rootPanel.add(footer);

		final HTMLElement divFooter = (HTMLElement) document.createElement(DivElement.TAG);
		divFooter.innerHTML = "Io Sono Il Footer!!!!!";
		footer.setHTMLContent(divFooter);

		final HTMLElement divHeader = (HTMLElement) document.createElement(DivElement.TAG);
		divHeader.innerHTML = "Io Sono Header!!!!!";
		header.setHTMLContent(divHeader);
	}

	private void generaLoremIpsum() {
		FlowPanel lorem = new FlowPanel();

		lorem.getElement().setInnerHTML(""
			+ "<p>"
			+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut turpis leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam facilisis felis nisi, sit amet euismod est vulputate dapibus. Vestibulum semper porttitor mattis. Maecenas sapien orci, tincidunt et pharetra eu, ornare vitae quam. Mauris pulvinar, lectus sed posuere tempor, odio leo lobortis dolor, egestas placerat quam ex sed felis. Nullam eget arcu nulla. Mauris hendrerit fringilla sapien in consectetur. Etiam diam enim, aliquam quis quam eu, sollicitudin faucibus quam. Nam a purus in turpis volutpat porta vel in sapien. Fusce feugiat ex eu nisl ultrices, nec bibendum sapien porttitor. In commodo hendrerit tellus ac gravida. Sed viverra mauris mattis odio viverra, eu rhoncus tortor pretium. Mauris consectetur neque arcu, ut egestas nulla gravida sit amet. Nunc in risus mi."
			+ "</p>"
			+ "<p>"
			+ "Sed faucibus bibendum ipsum, vitae placerat massa rutrum sit amet. Fusce porta lorem malesuada, blandit diam at, gravida leo. Nunc rutrum ultricies lacus, vestibulum sodales nisl molestie ac. Nam scelerisque laoreet justo, sit amet hendrerit quam semper sed. Suspendisse potenti. Curabitur hendrerit ex vel ligula tempus semper. Suspendisse pulvinar tellus at arcu lobortis dictum. Suspendisse potenti. Proin convallis fringilla quam sit amet lobortis. Donec consectetur, justo a bibendum cursus, urna lorem sollicitudin ante, sed maximus nunc arcu ac massa. Nulla finibus urna a lectus molestie, quis fringilla risus sagittis. Phasellus euismod tellus ac dolor condimentum tincidunt. Sed quis condimentum sapien, et tempor purus. Aenean rutrum leo sit amet mauris mattis cursus. Proin quam dolor, cursus sed urna ac, consequat tempor est. Vestibulum ante augue, sagittis ac ligula in, placerat rutrum velit."
			+ "</p>"
			+ "<p>"
			+ "Aliquam et erat quis lectus tincidunt molestie eget non justo. Suspendisse at pretium lorem. Nullam tempus egestas elit in ullamcorper. Donec in sem faucibus, sodales dolor in, efficitur ex. Nulla facilisi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nunc ut quam imperdiet, volutpat mauris elementum, facilisis nibh. Aliquam a sem pulvinar, auctor libero sed, congue dui."
			+ "</p>"
			+ "<p>"
			+ "Cras at tortor orci. Vivamus venenatis vestibulum sapien, vel hendrerit velit faucibus ac. Mauris maximus viverra convallis. Nulla facilisi. Integer euismod pretium nisl. Suspendisse dictum posuere orci quis dignissim. Sed lorem nibh, porttitor quis ex vitae, hendrerit mattis turpis. Nulla suscipit, velit vel ornare tincidunt, elit est tincidunt felis, a mattis nunc dui in turpis. Etiam ac nulla at neque sodales vestibulum id non lacus. Ut consequat maximus lobortis."
			+ "</p>"
			+ "<p>"
			+ "Proin in risus finibus, egestas magna at, finibus lacus. Donec a odio vitae nunc bibendum pellentesque. Donec consectetur tincidunt purus, at mollis turpis sagittis et. Integer a dapibus felis. Aenean ultricies tempus orci. Nullam massa elit, ornare aliquam tincidunt id, condimentum non lectus. Etiam enim est, ullamcorper sed lobortis nec, sagittis in lorem. Nulla et maximus nibh. Ut semper urna elit, placerat mattis turpis pharetra et. Fusce aliquet id sapien ac facilisis. In porta sollicitudin aliquet. In porttitor laoreet vestibulum."
			+ "</p>"
			+ "<p>"
			+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut turpis leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam facilisis felis nisi, sit amet euismod est vulputate dapibus. Vestibulum semper porttitor mattis. Maecenas sapien orci, tincidunt et pharetra eu, ornare vitae quam. Mauris pulvinar, lectus sed posuere tempor, odio leo lobortis dolor, egestas placerat quam ex sed felis. Nullam eget arcu nulla. Mauris hendrerit fringilla sapien in consectetur. Etiam diam enim, aliquam quis quam eu, sollicitudin faucibus quam. Nam a purus in turpis volutpat porta vel in sapien. Fusce feugiat ex eu nisl ultrices, nec bibendum sapien porttitor. In commodo hendrerit tellus ac gravida. Sed viverra mauris mattis odio viverra, eu rhoncus tortor pretium. Mauris consectetur neque arcu, ut egestas nulla gravida sit amet. Nunc in risus mi."
			+ "</p>"
			+ "<p>"
			+ "Sed faucibus bibendum ipsum, vitae placerat massa rutrum sit amet. Fusce porta lorem malesuada, blandit diam at, gravida leo. Nunc rutrum ultricies lacus, vestibulum sodales nisl molestie ac. Nam scelerisque laoreet justo, sit amet hendrerit quam semper sed. Suspendisse potenti. Curabitur hendrerit ex vel ligula tempus semper. Suspendisse pulvinar tellus at arcu lobortis dictum. Suspendisse potenti. Proin convallis fringilla quam sit amet lobortis. Donec consectetur, justo a bibendum cursus, urna lorem sollicitudin ante, sed maximus nunc arcu ac massa. Nulla finibus urna a lectus molestie, quis fringilla risus sagittis. Phasellus euismod tellus ac dolor condimentum tincidunt. Sed quis condimentum sapien, et tempor purus. Aenean rutrum leo sit amet mauris mattis cursus. Proin quam dolor, cursus sed urna ac, consequat tempor est. Vestibulum ante augue, sagittis ac ligula in, placerat rutrum velit."
			+ "</p>"
			+ "<p>"
			+ "Aliquam et erat quis lectus tincidunt molestie eget non justo. Suspendisse at pretium lorem. Nullam tempus egestas elit in ullamcorper. Donec in sem faucibus, sodales dolor in, efficitur ex. Nulla facilisi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nunc ut quam imperdiet, volutpat mauris elementum, facilisis nibh. Aliquam a sem pulvinar, auctor libero sed, congue dui."
			+ "</p>"
			+ "<p>"
			+ "Cras at tortor orci. Vivamus venenatis vestibulum sapien, vel hendrerit velit faucibus ac. Mauris maximus viverra convallis. Nulla facilisi. Integer euismod pretium nisl. Suspendisse dictum posuere orci quis dignissim. Sed lorem nibh, porttitor quis ex vitae, hendrerit mattis turpis. Nulla suscipit, velit vel ornare tincidunt, elit est tincidunt felis, a mattis nunc dui in turpis. Etiam ac nulla at neque sodales vestibulum id non lacus. Ut consequat maximus lobortis."
			+ "</p>"
			+ "<p>"
			+ "Proin in risus finibus, egestas magna at, finibus lacus. Donec a odio vitae nunc bibendum pellentesque. Donec consectetur tincidunt purus, at mollis turpis sagittis et. Integer a dapibus felis. Aenean ultricies tempus orci. Nullam massa elit, ornare aliquam tincidunt id, condimentum non lectus. Etiam enim est, ullamcorper sed lobortis nec, sagittis in lorem. Nulla et maximus nibh. Ut semper urna elit, placerat mattis turpis pharetra et. Fusce aliquet id sapien ac facilisis. In porta sollicitudin aliquet. In porttitor laoreet vestibulum."
			+ "</p>"
			+ "<p>"
			+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut turpis leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam facilisis felis nisi, sit amet euismod est vulputate dapibus. Vestibulum semper porttitor mattis. Maecenas sapien orci, tincidunt et pharetra eu, ornare vitae quam. Mauris pulvinar, lectus sed posuere tempor, odio leo lobortis dolor, egestas placerat quam ex sed felis. Nullam eget arcu nulla. Mauris hendrerit fringilla sapien in consectetur. Etiam diam enim, aliquam quis quam eu, sollicitudin faucibus quam. Nam a purus in turpis volutpat porta vel in sapien. Fusce feugiat ex eu nisl ultrices, nec bibendum sapien porttitor. In commodo hendrerit tellus ac gravida. Sed viverra mauris mattis odio viverra, eu rhoncus tortor pretium. Mauris consectetur neque arcu, ut egestas nulla gravida sit amet. Nunc in risus mi."
			+ "</p>"
			+ "<p>"
			+ "Sed faucibus bibendum ipsum, vitae placerat massa rutrum sit amet. Fusce porta lorem malesuada, blandit diam at, gravida leo. Nunc rutrum ultricies lacus, vestibulum sodales nisl molestie ac. Nam scelerisque laoreet justo, sit amet hendrerit quam semper sed. Suspendisse potenti. Curabitur hendrerit ex vel ligula tempus semper. Suspendisse pulvinar tellus at arcu lobortis dictum. Suspendisse potenti. Proin convallis fringilla quam sit amet lobortis. Donec consectetur, justo a bibendum cursus, urna lorem sollicitudin ante, sed maximus nunc arcu ac massa. Nulla finibus urna a lectus molestie, quis fringilla risus sagittis. Phasellus euismod tellus ac dolor condimentum tincidunt. Sed quis condimentum sapien, et tempor purus. Aenean rutrum leo sit amet mauris mattis cursus. Proin quam dolor, cursus sed urna ac, consequat tempor est. Vestibulum ante augue, sagittis ac ligula in, placerat rutrum velit."
			+ "</p>"
			+ "<p>"
			+ "Aliquam et erat quis lectus tincidunt molestie eget non justo. Suspendisse at pretium lorem. Nullam tempus egestas elit in ullamcorper. Donec in sem faucibus, sodales dolor in, efficitur ex. Nulla facilisi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nunc ut quam imperdiet, volutpat mauris elementum, facilisis nibh. Aliquam a sem pulvinar, auctor libero sed, congue dui."
			+ "</p>"
			+ "<p>"
			+ "Cras at tortor orci. Vivamus venenatis vestibulum sapien, vel hendrerit velit faucibus ac. Mauris maximus viverra convallis. Nulla facilisi. Integer euismod pretium nisl. Suspendisse dictum posuere orci quis dignissim. Sed lorem nibh, porttitor quis ex vitae, hendrerit mattis turpis. Nulla suscipit, velit vel ornare tincidunt, elit est tincidunt felis, a mattis nunc dui in turpis. Etiam ac nulla at neque sodales vestibulum id non lacus. Ut consequat maximus lobortis."
			+ "</p>"
			+ "<p>"
			+ "Proin in risus finibus, egestas magna at, finibus lacus. Donec a odio vitae nunc bibendum pellentesque. Donec consectetur tincidunt purus, at mollis turpis sagittis et. Integer a dapibus felis. Aenean ultricies tempus orci. Nullam massa elit, ornare aliquam tincidunt id, condimentum non lectus. Etiam enim est, ullamcorper sed lobortis nec, sagittis in lorem. Nulla et maximus nibh. Ut semper urna elit, placerat mattis turpis pharetra et. Fusce aliquet id sapien ac facilisis. In porta sollicitudin aliquet. In porttitor laoreet vestibulum."
			+ "</p>"
			+ "<p>"
			+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut turpis leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam facilisis felis nisi, sit amet euismod est vulputate dapibus. Vestibulum semper porttitor mattis. Maecenas sapien orci, tincidunt et pharetra eu, ornare vitae quam. Mauris pulvinar, lectus sed posuere tempor, odio leo lobortis dolor, egestas placerat quam ex sed felis. Nullam eget arcu nulla. Mauris hendrerit fringilla sapien in consectetur. Etiam diam enim, aliquam quis quam eu, sollicitudin faucibus quam. Nam a purus in turpis volutpat porta vel in sapien. Fusce feugiat ex eu nisl ultrices, nec bibendum sapien porttitor. In commodo hendrerit tellus ac gravida. Sed viverra mauris mattis odio viverra, eu rhoncus tortor pretium. Mauris consectetur neque arcu, ut egestas nulla gravida sit amet. Nunc in risus mi."
			+ "</p>"
			+ "<p>"
			+ "Sed faucibus bibendum ipsum, vitae placerat massa rutrum sit amet. Fusce porta lorem malesuada, blandit diam at, gravida leo. Nunc rutrum ultricies lacus, vestibulum sodales nisl molestie ac. Nam scelerisque laoreet justo, sit amet hendrerit quam semper sed. Suspendisse potenti. Curabitur hendrerit ex vel ligula tempus semper. Suspendisse pulvinar tellus at arcu lobortis dictum. Suspendisse potenti. Proin convallis fringilla quam sit amet lobortis. Donec consectetur, justo a bibendum cursus, urna lorem sollicitudin ante, sed maximus nunc arcu ac massa. Nulla finibus urna a lectus molestie, quis fringilla risus sagittis. Phasellus euismod tellus ac dolor condimentum tincidunt. Sed quis condimentum sapien, et tempor purus. Aenean rutrum leo sit amet mauris mattis cursus. Proin quam dolor, cursus sed urna ac, consequat tempor est. Vestibulum ante augue, sagittis ac ligula in, placerat rutrum velit."
			+ "</p>"
			+ "<p>"
			+ "Aliquam et erat quis lectus tincidunt molestie eget non justo. Suspendisse at pretium lorem. Nullam tempus egestas elit in ullamcorper. Donec in sem faucibus, sodales dolor in, efficitur ex. Nulla facilisi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nunc ut quam imperdiet, volutpat mauris elementum, facilisis nibh. Aliquam a sem pulvinar, auctor libero sed, congue dui."
			+ "</p>"
			+ "<p>"
			+ "Cras at tortor orci. Vivamus venenatis vestibulum sapien, vel hendrerit velit faucibus ac. Mauris maximus viverra convallis. Nulla facilisi. Integer euismod pretium nisl. Suspendisse dictum posuere orci quis dignissim. Sed lorem nibh, porttitor quis ex vitae, hendrerit mattis turpis. Nulla suscipit, velit vel ornare tincidunt, elit est tincidunt felis, a mattis nunc dui in turpis. Etiam ac nulla at neque sodales vestibulum id non lacus. Ut consequat maximus lobortis."
			+ "</p>"
			+ "<p>"
			+ "Proin in risus finibus, egestas magna at, finibus lacus. Donec a odio vitae nunc bibendum pellentesque. Donec consectetur tincidunt purus, at mollis turpis sagittis et. Integer a dapibus felis. Aenean ultricies tempus orci. Nullam massa elit, ornare aliquam tincidunt id, condimentum non lectus. Etiam enim est, ullamcorper sed lobortis nec, sagittis in lorem. Nulla et maximus nibh. Ut semper urna elit, placerat mattis turpis pharetra et. Fusce aliquet id sapien ac facilisis. In porta sollicitudin aliquet. In porttitor laoreet vestibulum."
			+ "</p>"
		);

		RootPanel.get().add(lorem);
	}
}
