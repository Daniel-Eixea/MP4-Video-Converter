# MP4 Video Converter

MP4 Video Converter is a simple tool to download YouTube videos or playlists in MP4 format with the best possible quality.

This program combines the power of `yt-dlp` and `ffmpeg` into an easy-to-use executable for users without technical knowledge.

---

## Features
- Download individual videos or entire playlists.
- Automatically converts to MP4 format with the best available video and audio quality.
- Preconfigured settings for easy use.

---

## Requirements
Before running the program, make sure you have the following:
1. **Windows:** This program is designed for Windows systems.
2. **Permissions:** The program requires internet access and permissions to read and write to the download folder.

---

## Installation
1. Download the `MP4 Video Converter.exe` executable from the [Releases](https://github.com/Daniel-Eixea/YTtoMP4/releases) section.
2. Make sure the required auxiliary files (if any) are in the correct folders:
   - `lib/yt-dlp.exe`
   - `lib/ffmpeg-7.1-full_build/bin/ffmpeg.exe`

---

## Usage
1. Run the program by double-clicking `MP4 Video Converter.exe`.
2. Enter a YouTube link:
   - **Single video:** Copy and paste the video link.
   - **Playlist:** Copy and paste the playlist link.
3. Press **Enter** to start the download.
4. Downloaded videos will be saved in the `Downloads` folder within the program's directory.
5. To exit the program, simply leave the field empty and press **Enter**.

---

## Known Issues
1. **Large files:** If the downloaded file exceeds 100 MB, the program may not work properly on systems with limited space.
2. **Network errors:** Ensure you're connected to the internet. If you encounter errors during the download, check the provided link or your connection.

---

## Frequently Asked Questions (FAQ)

### Where are the downloaded videos saved?
The videos are saved in the `Downloads` folder inside the directory where the `MP4 Video Converter.exe` file is located.

### What happens if I close the program before the download is complete?
If you close the program before the download finishes, the file will be incomplete. You can retry it by running the program again.

### Can I change the destination folder?
Yes, you can modify the source code or request a custom version if you're experienced in programming.

---

## License
NONE

---

## Contributions
If you have suggestions or encounter bugs, please open an issue in the project repository or send an email to the developer.

---

## Credits
- **yt-dlp:** [https://github.com/yt-dlp/yt-dlp](https://github.com/yt-dlp/yt-dlp)
- **FFmpeg:** [https://ffmpeg.org/](https://ffmpeg.org/)
