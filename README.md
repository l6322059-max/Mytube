# MyTube

A YouTube-style Android app that loads videos from YouTube's own servers:

- **Trending + search** through the official YouTube Data API v3
- **Playback** through YouTube's official embedded player (so it follows YouTube's terms)
- **Open YouTube.com** inside the app from the menu (⋮)

## 1. Get a free YouTube API key (2 minutes)

1. Open <https://console.cloud.google.com> and create a project.
2. Go to **APIs & Services → Library**, search **YouTube Data API v3**, tap **Enable**.
3. Go to **APIs & Services → Credentials → Create credentials → API key**.
4. Copy the key.

The free quota is 10,000 units a day. A search costs about 100 units, so roughly 100 searches a day. Trending is cheap.

## 2. Build the APK

1. Push this project to a GitHub repository (branch `main`).
2. *(Optional)* Add the key as a repository secret named `YOUTUBE_API_KEY`
   (Settings → Secrets and variables → Actions) so it is built into the app.
   If you skip this, the app asks for the key the first time you open it.
3. Open the **Actions** tab → **Build APK** → wait for the green check.
4. Open the finished run → **Artifacts** → **MyTube-apk** → download, unzip, install `app-debug.apk`.

## Good to know

- Ads: playback uses YouTube's own player, so any ads YouTube serves are shown. MyTube does not block them.
- No Google sign-in: Google blocks sign-in inside embedded browsers, so subscriptions, likes and your library are not included.
- Anyone who has the APK can extract a key that was built into it. Keep the APK to yourself, or enter the key in the app instead of using the secret.
