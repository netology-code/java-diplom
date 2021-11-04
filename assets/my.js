async function submit() {
  setLoading(true);
  const url = document.getElementById("img-url").value;
  if (!url) {
    error("Урл не может быть пустым!")
    return;
  }
  try {
    const resp = await fetch('/convert', {
      method: "POST",
      body: url
    });
    if (!resp.ok) {
      error("Не могу сконвертировать :'(")
      return;
    }
    const txtImgRaw = await resp.text();
    console.log(txtImgRaw.split("\n").length);
    const txtImgCleaned = txtImgRaw.replaceAll("\n", "<br/>");
    console.log(txtImgCleaned.split("<br/>").length);
    console.log(txtImgCleaned)
    document.getElementById("txtimg").innerHTML = txtImgCleaned;
    succ("Ваше изображение сконвертировано!");
  } catch (e) {
    error("Не могу сконвертировать :'(")
  }
}

function clearStatus() {
  document.getElementById("alert").innerHTML = "";
}

function status(msg, type) {
  document.getElementById("alert").innerHTML = `
    <div class="alert alert-${type}" role="alert">
      ${msg}
    </div>
  `;
}

function warn(msg) {
  status(msg, "warning");
}

function succ(msg) {
  status(msg, "success");
}

function info(msg) {
  status(msg, "info");
}

function error(msg) {
  status(msg, "danger");
}

function setLoading(isLoading) {
  if (isLoading) {
    const spinner = `
      <div class="spinner-border text-primary" role="status">
        <span class="visually-hidden">Loading...</span>
      </div>`;
    status(spinner, "info");
  } else {
    clearStatus();
  }
}