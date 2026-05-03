# 🏋️ Gym System API

API REST básica para gestión de miembros de un gimnasio desarrollada con **Spring Boot**.

---

## 🚀 Tecnologías

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

---

## 🧱 Arquitectura

Estructura basada en **MVC**:

* `controller` → endpoints REST
* `service` → lógica de negocio
* `repository` → acceso a datos
* `model` → entidades
* `dto` → entrada/salida de datos

---

## 🔁 Endpoints

### Crear miembro

<pre class="overflow-visible! px-0!" data-start="545" data-end="570"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>POST /api/members
</span></span></code></div></div></pre>

<pre class="overflow-visible! px-0!" data-start="571" data-end="649"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-json"><span><span>{</span><span>
  </span><span>"name"</span><span>:</span><span> </span><span>"Arturo"</span><span>,</span><span>
  </span><span>"age"</span><span>:</span><span> </span><span>23</span><span>,</span><span>
  </span><span>"membershipType"</span><span>:</span><span> </span><span>"Mensual"</span><span>
</span><span>}</span><span>
</span></span></code></div></div></pre>

---

### Obtener todos

<pre class="overflow-visible! px-0!" data-start="674" data-end="698"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>GET /api/members
</span></span></code></div></div></pre>

---

### Obtener por ID

<pre class="overflow-visible! px-0!" data-start="724" data-end="753"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>GET /api/members/{</span><span>id</span><span>}
</span></span></code></div></div></pre>

---

### Actualizar

<pre class="overflow-visible! px-0!" data-start="775" data-end="804"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>PUT /api/members/{</span><span>id</span><span>}
</span></span></code></div></div></pre>

---

### Eliminar

<pre class="overflow-visible! px-0!" data-start="824" data-end="856"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>DELETE /api/members/{</span><span>id</span><span>}
</span></span></code></div></div></pre>

---

## ⚙️ Ejecución

<pre class="overflow-visible! px-0!" data-start="880" data-end="914"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-bash"><span><span>./mvnw spring-boot:run
</span></span></code></div></div></pre>

Accede en:

<pre class="overflow-visible! px-0!" data-start="927" data-end="968"><div class="contain-inline-size rounded-2xl corner-superellipse/1.1 relative bg-token-sidebar-surface-primary"><div class="sticky top-[calc(var(--sticky-padding-top)+9*var(--spacing))]"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre!"><span><span>http://localhost:8080/api/members</span></span></code></div></div></pre>
