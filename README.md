<div style="text-align: center;">
# 🧙‍♂️ Math Wizdom

[![Version](https://img.shields.io/badge/version-0.9--beta-orange)](https://github.com/Venomous0511/math_wizdom/releases)
[![Status](https://img.shields.io/badge/status-beta-yellow)](https://github.com/Venomous0511/math_wizdom)
[![Android](https://img.shields.io/badge/Android-12+-green)](https://www.android.com)
[![License](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

**An interactive mathematics learning Android app designed to make math engaging and accessible for everyone.**

</div>

---

## 📖 About

Math Wizdom is an Android educational app that transforms traditional mathematics learning into an interactive and engaging mobile experience. Through carefully designed lessons, real-time feedback, timed activities, and intuitive visualizations, students can master mathematical concepts at their own pace, right from their Android devices.

### ✨ Key Features

- **🎨 Modern Interface** - Clean, intuitive design optimized for Android devices with 3-column grid layout
- **📚 Interactive Lessons** - Hands-on problem-solving with instant feedback and visual guides
- **⏱️ Timed Activities** - Focused learning with activity timers
- **🔒 Progressive Learning** - Sequential lesson unlocking with quarter-based progression system
- **📊 Progress Tracking** - Real-time menu bar showing unlocked lessons and learning achievements
- **🎬 Video Tutorials** - Complete video integration with randomized playback and required completion
- **📱 Native Android** - Built specifically for Android 12+ devices
- **🎯 Achievement-Based Advancement** - Complete 2 activities with scores of 3+ to unlock next lesson
- **⚡ Offline Support** - Learn anywhere, even without internet connection
- **👤 Student Profiles** - Personalized avatars and profile customization

---

## 🛠️ Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Android Studio** (Arctic Fox or newer recommended)
- **JDK 11** or higher
- **Android SDK** (API Level 31+)
- **Git**

### System Requirements

**For Development:**
- OS: Windows 10/11, macOS 10.14+, or Linux
- RAM: 8GB minimum (16GB recommended)
- Storage: 4GB minimum free space

**For Running the App:**
- Android device or emulator running **Android 12 (API 31)** or higher

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Venomous0511/math_wizdom.git
   cd math_wizdom
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned `math_wizdom` folder
   - Click "OK"

3. **Sync Gradle**
   - Android Studio will automatically prompt to sync Gradle
   - Click "Sync Now" and wait for dependencies to download

4. **Configure an Android Virtual Device (AVD)** *(Optional if using physical device)*
   - Go to Tools → Device Manager
   - Create a new virtual device with Android 12+ (API 31+)

5. **Run the app**
   - Connect your Android device via USB (with USB debugging enabled)
   - OR start your Android emulator
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - Select your device and click "OK"

### Building APK

To build a debug APK:
```bash
./gradlew assembleDebug
```

The APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

To build a release APK:
```bash
./gradlew assembleRelease
```

---

## 🎯 Roadmap

### Current Focus (Beta Phase)
✅ Completed (v0.9 Beta)
- [x] Room database implementation
- [x] Core lesson structure with 4 quarters
- [x] Material Design UI
- [x] Interactive activities with timers
- [x] Interactive lessons with PDF slides
- [x] Complete video tutorial integration
- [x] All activities completed across all quarters
- [x] All lesson content finalized
- [x] Progressive learning system with quarter locking
- [x] Student authentication system
- [x] Profile customization with avatars
- [x] Progress tracking in menu bar
- [x] Activity guides with visual instructions

### Current Focus (Pre-v1.0)
- [ ] Final bug fixes and performance optimizations
- [ ] Enhanced analytics dashboard
- [ ] Additional accessibility features
- [ ] Comprehensive testing across devices
- [ ] User feedback integration

### Future Plans
- Gamification elements (badges, achievements)
- Cloud sync for cross-device progress
- Social learning features
- Tablet optimization
- iOS version development
- Multi-language support

---

### 📚 App Structure
Learning Progression
- 4 Quarters - Complete curriculum divided into sequential quarters
- Sequential Unlocking - Q2, Q3, and Q4 unlock after completing previous quarter
- Lesson-Based Learning - Each quarter contains multiple lessons with topics
- Activity Requirements - 2 activities with scores of 3+ to unlock next lesson

Activity Types
- True/False & 2-Choice - 60 seconds per question
- Multiple Choice (3-4 options) - 60 seconds per question
- Matching Type - 5 minutes total
- Crossing Activities - 5 minutes total
- Video Activities - Required completion with randomized content

---

## 🐛 Bug Reports & Feature Requests

Found a bug or have a suggestion? We'd love to hear from you!

- **Bug Report**: [Create a bug report](https://github.com/Venomous0511/math_wizdom/issues/new?template=bug_report.md)
- **Feature Request**: [Request a feature](https://github.com/Venomous0511/math_wizdom/issues/new?template=feature_request.md)

---

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

Please ensure your code follows our coding standards and includes appropriate tests.

---

## 🧪 Testing

Run the test suite:

```bash
# Run unit tests
./gradlew test

# Run instrumented tests (requires emulator/device)
./gradlew connectedAndroidTest

# Run tests with coverage report
./gradlew jacocoTestReport
```

---

## 👥 Team

- **Backend Developer**: [Venomous0511](https://github.com/Venomous0511)
- **Frontend Developer**: [Jeriellog](https://github.com/Jeriellog).

---

## 🙏 Acknowledgments

- Thanks to all beta testers for their invaluable feedback on v0.8 and v0.9
- Special appreciation to our focus group for identifying critical UI/UX improvements
- Inspired by modern educational technology practices
- Built with passion for making math accessible to everyone

---

## 📬 Contact

Have questions or want to get in touch?

- **GitHub Issues**: [Report an issue](https://github.com/Venomous0511/math_wizdom/issues)

---

## ⚠️ Beta Notice

**This is beta software.** While we've implemented complete content and tested thoroughly, you may encounter minor bugs or areas for refinement. This version is not recommended for production deployment yet. Please report any issues you find to help us prepare for the v1.0 release!

---

<div style="text-align: center;">

**Made with ❤️ for math learners everywhere**

[⬆ Back to Top](https://github.com/Venomous0511/math_wizdom)

</div>
