<div align="center">

# 🧙‍♂️ Math Wizdom 

[![Version](https://img.shields.io/badge/version-1.0.0-brightgreen)](https://github.com/Venomous0511/math_wizdom/releases)
[![Status](https://img.shields.io/badge/status-stable-green)](https://github.com/Venomous0511/math_wizdom)
[![Android](https://img.shields.io/badge/Android-12+-green)](https://www.android.com)
[![License](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

**An interactive mathematics learning Android app designed to make math engaging and accessible for everyone.**

[📥 Download](https://github.com/Venomous0511/math_wizdom/releases/latest) • [📖 Documentation](#-getting-started) • [🐛 Report Bug](https://github.com/Venomous0511/math_wizdom/issues) • [💡 Request Feature](https://github.com/Venomous0511/math_wizdom/issues)

</div>

---

## 📖 About

Math Wizdom is an Android educational app that transforms traditional mathematics learning into an interactive and engaging mobile experience. Through carefully designed lessons, real-time feedback, timed activities, and intuitive visualizations, students can master mathematical concepts at their own pace, right from their Android devices.

**Now officially released as v1.0** - Production-ready and fully tested for classroom deployment! 🎉

### ✨ Key Features

- **🎨 Modern Interface** - Clean, intuitive design optimized for Android devices with a 3-column grid layout
- **📚 Interactive Lessons** - Hands-on problem-solving with instant feedback and visual guides
- **⏱️ Timed Activities** - Focused learning with activity timers (60s for questions, 5min for activities)
- **🔒 Progressive Learning** - Sequential lesson unlocking with quarter-based progression system
- **📊 Progress Tracking** - Real-time menu bar showing unlocked lessons and learning achievements
- **🎬 Video Tutorials** - Complete video integration with randomized playback and required completion
- **📱 Native Android** - Built specifically for Android 12+ devices
- **🎯 Achievement-Based Advancement** - Complete 2 activities with scores of 3+ to unlock next lesson
- **⚡ Offline Support** - Learn anywhere, even without an internet connection
- **👤 Student Profiles** - Personalized avatars and profile customization
- **📐 Professional Content** - Justified paragraphs with proper formatting and example slides

---

## 🚀 Quick Start

### Download & Install

1. **Download the latest APK** from [Releases](https://github.com/Venomous0511/math_wizdom/releases/latest)
2. **Enable installation from unknown sources** on your Android device
3. **Install** the APK file
4. **Launch** Math Wizdom and create your student profile
5. **Start learning!** Begin with Quarter 1, Lesson 1

### System Requirements

**Minimum:**
- Android 12 (API 31) or higher
- 150MB free storage space
- 2GB RAM
- Internet connection for video tutorials

**Recommended:**
- Android 13+ for optimal performance
- 4GB RAM
- Wi-Fi connection for the best video streaming experience

---

## 🛠️ For Developers

### Prerequisites

Before you begin, ensure you have the following installed:
- **Android Studio** (Arctic Fox or newer recommended)
- **JDK 11** or higher
- **Android SDK** (API Level 31+)
- **Git**

### Development System Requirements

- OS: Windows 10/11, macOS 10.14+, or Linux
- RAM: 8GB minimum (16GB recommended)
- Storage: 4GB minimum free space

### Installation & Setup

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
   - Select your device and click "OK."

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

## 📚 App Structure

### Learning Progression
- **4 Quarters** - Complete curriculum divided into sequential quarters
- **Sequential Unlocking** - Q2, Q3, and Q4 unlock after completing previous quarter's final lesson
- **Lesson-Based Learning** - Each quarter contains multiple lessons with topics
- **Activity Requirements** - Complete 2 activities with scores of 3+ to unlock next lesson

### Activity Types & Timers
| Activity Type | Time Limit | Description |
|--------------|------------|-------------|
| True/False & 2-Choice | 60 seconds/question | Quick decision-making practice |
| Multiple Choice (3-4 options) | 60 seconds/question | Concept comprehension testing |
| Matching Type | 5 minutes total | Pattern recognition activities |
| Crossing Activities | 5 minutes total | Problem-solving exercises |
| Video Activities | No time limit | Required viewing with randomization |

### Content Features
- **All About App** - Comprehensive app guide accessible from menu
- **Preview & Zoom** - Slides display in preview mode with full-screen zoom option
- **Visual Guides** - Activity instructions with illustrated examples
- **Justified Content** - Professional paragraph formatting with first-line indentation
- **Example Slides** - Sample problems throughout lessons

---

## 🎯 Roadmap

### ✅ v1.0.0 (Current Release - January 2025)
- [x] Complete lesson content across all 4 quarters
- [x] All activity types implemented with timers
- [x] Progressive learning system with quarter locking
- [x] Video tutorial integration
- [x] Student authentication and profiles
- [x] Progress tracking system
- [x] Enhanced UI/UX with justified content
- [x] Preview and zoom functionality
- [x] All About App section
- [x] Production-ready stability

### 🔄 v1.1.0 (Planned - Q1 2025)
- [ ] Enhanced analytics dashboard
- [ ] Detailed progress reports
- [ ] Additional accessibility features
- [ ] Improved tablet optimization
- [ ] Performance enhancements

### 🔮 Future Plans (v1.2.0+)
- Gamification elements (badges, leaderboards, achievements)
- Cloud sync for cross-device progress
- Social learning features (study groups, peer challenges)
- Teacher dashboard and classroom management
- Multi-language support
- iOS version development
- Offline video caching
- Advanced analytics and insights

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

### Test Coverage

- Unit Tests: Core business logic and data models
- Integration Tests: Database operations and API calls
- UI Tests: User interactions and navigation flows

---

## 🐛 Bug Reports & Feature Requests

Found a bug or have a suggestion? We'd love to hear from you!

- **🐛 Bug Report**: [Create a bug report](https://github.com/Venomous0511/math_wizdom/issues/new?template=bug_report.md)
- **💡 Feature Request**: [Request a feature](https://github.com/Venomous0511/math_wizdom/issues/new?template=feature_request.md)

### Reporting Guidelines

When reporting issues, please include:
- Clear description of the problem
- Steps to reproduce
- Expected vs actual behavior
- Android version and device model
- Screenshots or screen recordings (if applicable)

---

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

### Contribution Guidelines

- Follow existing code style and conventions
- Write clear commit messages
- Include tests for new features
- Update documentation as needed
- Ensure all tests pass before submitting PR

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

---

## 👥 Team

- **Backend Developer**: [Venomous0511](https://github.com/Venomous0511)
- **Frontend Developer**: [Jeriellog](https://github.com/Jeriellog)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- **Beta Testers** - Thank you to all v0.8 and v0.9 beta testers for invaluable feedback
- **Focus Group** - Special appreciation for identifying critical UI/UX improvements
- **Community Contributors** - Everyone who reported bugs and suggested features
- **Educational Technology** - Inspired by modern EdTech best practices
- **Open Source Community** - Built with amazing open-source tools and libraries

---

## 📬 Contact & Support

Have questions or want to get in touch?

- **📋 GitHub Issues**: [Report an issue](https://github.com/Venomous0511/math_wizdom/issues)
- **💬 Discussions**: [Join the conversation](https://github.com/Venomous0511/math_wizdom/discussions)

---

## 📊 Project Stats

![GitHub release (latest by date)](https://img.shields.io/github/v/release/Venomous0511/math_wizdom)
![GitHub all releases](https://img.shields.io/github/downloads/Venomous0511/math_wizdom/total)
![GitHub issues](https://img.shields.io/github/issues/Venomous0511/math_wizdom)
![GitHub pull requests](https://img.shields.io/github/issues-pr/Venomous0511/math_wizdom)
![GitHub stars](https://img.shields.io/github/stars/Venomous0511/math_wizdom)

---

## 📝 Release Notes

**Latest Release: v1.0.0** (December 30, 2025)

### Highlights
✨ Official production release  
📐 Enhanced content formatting with justified paragraphs  
🔍 Improved preview and zoom functionality  
👤 Refined profile and authentication UI  
📱 New "All About App" section  

[View Full Release Notes](https://github.com/Venomous0511/math_wizdom/releases/latest) | [Version History](CHANGELOG.md)

---

<div align="center">

**Made with ❤️ for math learners everywhere**

**Math Wizdom v1.0** - Empowering students through engaging mathematics education

[⬆ Back to Top](#-math-wizdom)

</div>
