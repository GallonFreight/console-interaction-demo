package libraries;

import com.sun.jna.*;

public interface CLibrary extends Library {
	CLibrary INSTANCE = Native.load("c", CLibrary.class);

	int ioctl(int fd, int request, Winsize data);
	// standard fd values are described in <unistd.h>
	// standard request values are described in <bits/ioctls.h>

	@Structure.FieldOrder({"ws_row", "ws_col", "ws_xpixel", "ws_ypixel"})
	class Winsize extends Structure {
		public short ws_row;
		public short ws_col;
		public short ws_xpixel;
		public short ws_ypixel;
	}
}
