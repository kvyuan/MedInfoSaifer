import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;

public class deletefile {

	public static String directory = "C:/Users/liuya/Desktop";

	public static FileTime getmodifiedTime(File file) throws IOException {
		Path p = Paths.get(file.getAbsolutePath());
		BasicFileAttributes view = Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
		FileTime fileTime = view.lastModifiedTime();
		// also available view.lastAccessTine and view.lastModifiedTime
		return fileTime;
	}

	public static void main(String[] args) throws IOException {

		// list of files in directory
		File dir = new File(directory);
		File[] directoryListing = dir.listFiles();

		// if not empty
		if (directoryListing != null) {
			// for each file
			for (File child : directoryListing) {

				// get create time
				String modifytime = new SimpleDateFormat("dd:MM:yyyy:HH:mm:ss")
						.format(deletefile.getmodifiedTime(child).toMillis());

				// get current time
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy:HH:mm:ss");
				String currenttime = sdf.format(cal.getTime());

				// split time for passing in to time diff function
				String[] tokens1 = modifytime.trim().split(":");
				String[] tokens2 = currenttime.trim().split(":");

				// set time vairable
				LocalDateTime date1 = LocalDateTime.of(Integer.parseInt(tokens1[2]),
						Month.of(Integer.parseInt(tokens1[1])), Integer.parseInt(tokens1[0]),
						Integer.parseInt(tokens1[3]), Integer.parseInt(tokens1[4]), Integer.parseInt(tokens1[5]));
				LocalDateTime date2 = LocalDateTime.of(Integer.parseInt(tokens2[2]),
						Month.of(Integer.parseInt(tokens2[1])), Integer.parseInt(tokens2[0]),
						Integer.parseInt(tokens2[3]), Integer.parseInt(tokens2[4]), Integer.parseInt(tokens2[5]));

				// delete file > 24 hours
				// if (ChronoUnit.HOURS.between(date1, date2) > 24) {
				// child.delete();
				// }
			}
		}

	}

	// return list of files
	public static File[] retlst(Path path) {
		File dir = new File(path.toString());
		File[] directoryListing = dir.listFiles();
		return directoryListing;
	}

	// delete single file
	public static void deletsingelfile(String name) {
		File file = new File(name);
		file.delete();
	}

	// modify last modify time
	public static void modifytime(File file) throws IOException {
		Path p = Paths.get(file.getAbsolutePath());
		long time = System.currentTimeMillis();
		FileTime fileTime = FileTime.fromMillis(time);
		Files.setAttribute(p, "basic:lastModifiedTime", fileTime, NOFOLLOW_LINKS);
	}
}