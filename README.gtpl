👨‍💻 Full Stack Developer / Quantitative<br/>

Most of my recent projects are private

# 📊 GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/gameshler/gameshler/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 2 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 1 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
