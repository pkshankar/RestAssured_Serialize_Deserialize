package complexPojo_04;

public class _Links {

	private Self self;
	private Edit edit;
	private Avatar avatar;

	public _Links(Self self, Edit edit, Avatar avatar) {

		this.self = self;
		this.edit = edit;
		this.avatar = avatar;
	}

	public _Links() {

	}

	public Self getSelf() {
		return self;
	}

	public Edit getEdit() {
		return edit;
	}

	public Avatar getAvatar() {
		return avatar;
	}

}
